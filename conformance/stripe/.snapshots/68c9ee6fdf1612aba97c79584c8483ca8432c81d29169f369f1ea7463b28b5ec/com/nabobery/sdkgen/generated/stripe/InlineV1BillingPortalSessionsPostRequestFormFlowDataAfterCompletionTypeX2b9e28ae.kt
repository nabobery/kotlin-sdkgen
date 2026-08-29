package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/after_completion/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/after_completion/properties/type
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae.Serializer::class)
public sealed class InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `hosted_confirmation`.
   */
  public data object HostedConfirmation : InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae() {
    public override val `value`: String = "hosted_confirmation"
  }

  /**
   * Documented value. Wire value: `portal_homepage`.
   */
  public data object PortalHomepage : InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae() {
    public override val `value`: String = "portal_homepage"
  }

  /**
   * Documented value. Wire value: `redirect`.
   */
  public data object Redirect : InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae() {
    public override val `value`: String = "redirect"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae = when (value) {
      HostedConfirmation.value -> HostedConfirmation
      PortalHomepage.value -> PortalHomepage
      Redirect.value -> Redirect
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae) {
      encoder.encodeString(value.value)
    }
  }
}
