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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1credit_reversals/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1credit_reversals/get/parameters/6/schema
 */
@Serializable(with = InlineV1TreasuryCreditReversalsGetParameterX874277c2.Serializer::class)
public sealed class InlineV1TreasuryCreditReversalsGetParameterX874277c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1TreasuryCreditReversalsGetParameterX874277c2() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `posted`.
   */
  public data object Posted : InlineV1TreasuryCreditReversalsGetParameterX874277c2() {
    public override val `value`: String = "posted"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineV1TreasuryCreditReversalsGetParameterX874277c2() {
    public override val `value`: String = "processing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryCreditReversalsGetParameterX874277c2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryCreditReversalsGetParameterX874277c2 = when (value) {
      Canceled.value -> Canceled
      Posted.value -> Posted
      Processing.value -> Processing
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryCreditReversalsGetParameterX874277c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryCreditReversalsGetParameterX874277c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryCreditReversalsGetParameterX874277c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryCreditReversalsGetParameterX874277c2) {
      encoder.encodeString(value.value)
    }
  }
}
