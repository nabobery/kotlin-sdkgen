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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/flow_directions/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/flow_directions/items
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inbound`.
   */
  public data object Inbound : InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c() {
    public override val `value`: String = "inbound"
  }

  /**
   * Documented value. Wire value: `outbound`.
   */
  public data object Outbound : InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c() {
    public override val `value`: String = "outbound"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c = when (value) {
      Inbound.value -> Inbound
      Outbound.value -> Outbound
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c) {
      encoder.encodeString(value.value)
    }
  }
}
