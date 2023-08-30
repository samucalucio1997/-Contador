






#application.yml
spring_profile_activity = prod
PRO_DB_HOST=containers-us-west-195.railway.app
PRO_DB_PORT=7233
PRO_DB_NAME=railway
PRO_DB_PASSWORD=Hizv15knwXrMRuSSLd76
PRO_DB_USERNAME=postgres





















classDiagram
    class ClubMember {
        - name: String
        - membershipNumber: String
        - package: MembershipPackage
        - paymentStatus: boolean
        + ClubMember(name: String, numCadastro: String, package: MembershipPackage, statusdePagamento: boolean)
        + getName(): String
        + getMembershipNumber(): String
        + getPackage(): MembershipPackage
        + getPaymentStatus(): boolean
    }

    class MembershipPackage {
        - packageName: String
        - packageValue: String
        - benefits: String
        + MembershipPackage(name: String, value: String, benefits: String)
        + getPackageName(): String
        + getPackageValue(): String
        + getBenefits(): String
    }

    ClubMember -- MembershipPackage : has