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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/flow_directions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/flow_directions/items
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inbound`.
   */
  public data object Inbound : InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e() {
    public override val `value`: String = "inbound"
  }

  /**
   * Documented value. Wire value: `outbound`.
   */
  public data object Outbound : InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e() {
    public override val `value`: String = "outbound"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e = when (value) {
      Inbound.value -> Inbound
      Outbound.value -> Outbound
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXc9a9a21e) {
      encoder.encodeString(value.value)
    }
  }
}
