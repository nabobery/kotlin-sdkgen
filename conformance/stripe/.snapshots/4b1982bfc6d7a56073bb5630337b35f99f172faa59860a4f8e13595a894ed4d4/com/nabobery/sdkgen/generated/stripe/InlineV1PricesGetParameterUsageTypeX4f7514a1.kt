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
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/get/parameters/8/schema/properties/usage_type.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1prices/get/parameters/8/schema/properties/usage_type
 */
@Serializable(with = InlineV1PricesGetParameterUsageTypeX4f7514a1.Serializer::class)
public sealed class InlineV1PricesGetParameterUsageTypeX4f7514a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `licensed`.
   */
  public data object Licensed : InlineV1PricesGetParameterUsageTypeX4f7514a1() {
    public override val `value`: String = "licensed"
  }

  /**
   * Documented value. Wire value: `metered`.
   */
  public data object Metered : InlineV1PricesGetParameterUsageTypeX4f7514a1() {
    public override val `value`: String = "metered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesGetParameterUsageTypeX4f7514a1()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesGetParameterUsageTypeX4f7514a1 = when (value) {
      Licensed.value -> Licensed
      Metered.value -> Metered
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesGetParameterUsageTypeX4f7514a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PricesGetParameterUsageTypeX4f7514a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesGetParameterUsageTypeX4f7514a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesGetParameterUsageTypeX4f7514a1) {
      encoder.encodeString(value.value)
    }
  }
}
