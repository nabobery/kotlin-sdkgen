package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The policy that controls when fork PR workflows require approval from a maintainer.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/actions-fork-pr-contributor-approval/properties/approval_policy
 */
@Serializable(with = InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb.Serializer::class)
public sealed class InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `first_time_contributors_new_to_github`.
   */
  public data object FirstTimeContributorsNewToGithub : InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb() {
    public override val `value`: String = "first_time_contributors_new_to_github"
  }

  /**
   * Documented value. Wire value: `first_time_contributors`.
   */
  public data object FirstTimeContributors : InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb() {
    public override val `value`: String = "first_time_contributors"
  }

  /**
   * Documented value. Wire value: `all_external_contributors`.
   */
  public data object AllExternalContributors : InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb() {
    public override val `value`: String = "all_external_contributors"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb()

  public companion object {
    public fun fromValue(`value`: String): InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb = when (value) {
      FirstTimeContributorsNewToGithub.value -> FirstTimeContributorsNewToGithub
      FirstTimeContributors.value -> FirstTimeContributors
      AllExternalContributors.value -> AllExternalContributors
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineActionsForkPrContributorApprovalApprovalPolicyX004de1cb) {
      encoder.encodeString(value.value)
    }
  }
}
