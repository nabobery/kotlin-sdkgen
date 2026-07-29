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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/tracking_details/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/tracking_details/properties/type
 */
@Serializable(with = InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987.Serializer::class)
public sealed class InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `us_domestic_wire`.
   */
  public data object UsDomesticWire : InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987() {
    public override val `value`: String = "us_domestic_wire"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987 = when (value) {
      Ach.value -> Ach
      UsDomesticWire.value -> UsDomesticWire
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsTypeXb3bd0987) {
      encoder.encodeString(value.value)
    }
  }
}
