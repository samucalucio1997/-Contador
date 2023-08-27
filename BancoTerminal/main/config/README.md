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