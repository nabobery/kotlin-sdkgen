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
 * sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/flow_directions/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/flow_directions/items
 */
@Serializable(with = InlineSetupIntentFlowDirectionsItemX0f009201.Serializer::class)
public sealed class InlineSetupIntentFlowDirectionsItemX0f009201 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inbound`.
   */
  public data object Inbound : InlineSetupIntentFlowDirectionsItemX0f009201() {
    public override val `value`: String = "inbound"
  }

  /**
   * Documented value. Wire value: `outbound`.
   */
  public data object Outbound : InlineSetupIntentFlowDirectionsItemX0f009201() {
    public override val `value`: String = "outbound"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentFlowDirectionsItemX0f009201()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentFlowDirectionsItemX0f009201 = when (value) {
      Inbound.value -> Inbound
      Outbound.value -> Outbound
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentFlowDirectionsItemX0f009201> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentFlowDirectionsItemX0f009201", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentFlowDirectionsItemX0f009201 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentFlowDirectionsItemX0f009201) {
      encoder.encodeString(value.value)
    }
  }
}
