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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/get/parameters/4/schema
 */
@Serializable(with = InlineV1TaxRegistrationsGetParameterX93759b9d.Serializer::class)
public sealed class InlineV1TaxRegistrationsGetParameterX93759b9d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1TaxRegistrationsGetParameterX93759b9d() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineV1TaxRegistrationsGetParameterX93759b9d() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineV1TaxRegistrationsGetParameterX93759b9d() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `scheduled`.
   */
  public data object Scheduled : InlineV1TaxRegistrationsGetParameterX93759b9d() {
    public override val `value`: String = "scheduled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxRegistrationsGetParameterX93759b9d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxRegistrationsGetParameterX93759b9d = when (value) {
      Active.value -> Active
      All.value -> All
      Expired.value -> Expired
      Scheduled.value -> Scheduled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsGetParameterX93759b9d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsGetParameterX93759b9d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsGetParameterX93759b9d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsGetParameterX93759b9d) {
      encoder.encodeString(value.value)
    }
  }
}
