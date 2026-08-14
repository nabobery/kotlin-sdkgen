package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The specified type of behavior after the flow is completed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow_after_completion/properties/type
 */
@Serializable(with = InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4.Serializer::class)
public sealed class InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `hosted_confirmation`.
   */
  public data object HostedConfirmation : InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4() {
    public override val `value`: String = "hosted_confirmation"
  }

  /**
   * Documented value. Wire value: `portal_homepage`.
   */
  public data object PortalHomepage : InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4() {
    public override val `value`: String = "portal_homepage"
  }

  /**
   * Documented value. Wire value: `redirect`.
   */
  public data object Redirect : InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4() {
    public override val `value`: String = "redirect"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4 = when (value) {
      HostedConfirmation.value -> HostedConfirmation
      PortalHomepage.value -> PortalHomepage
      Redirect.value -> Redirect
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsFlowAfterCompletionTypeX05eee8d4) {
      encoder.encodeString(value.value)
    }
  }
}
