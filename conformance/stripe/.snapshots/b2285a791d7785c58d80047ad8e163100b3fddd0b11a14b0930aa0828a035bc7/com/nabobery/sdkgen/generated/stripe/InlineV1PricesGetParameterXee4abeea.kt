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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1prices/get/parameters/10/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1prices/get/parameters/10/schema
 */
@Serializable(with = InlineV1PricesGetParameterXee4abeea.Serializer::class)
public sealed class InlineV1PricesGetParameterXee4abeea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `one_time`.
   */
  public data object OneTime : InlineV1PricesGetParameterXee4abeea() {
    public override val `value`: String = "one_time"
  }

  /**
   * Documented value. Wire value: `recurring`.
   */
  public data object Recurring : InlineV1PricesGetParameterXee4abeea() {
    public override val `value`: String = "recurring"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesGetParameterXee4abeea()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesGetParameterXee4abeea = when (value) {
      OneTime.value -> OneTime
      Recurring.value -> Recurring
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PricesGetParameterXee4abeea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PricesGetParameterXee4abeea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesGetParameterXee4abeea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesGetParameterXee4abeea) {
      encoder.encodeString(value.value)
    }
  }
}
