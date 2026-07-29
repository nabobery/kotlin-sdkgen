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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/get/parameters/7/schema
 */
@Serializable(with = InlineV1IssuingCardholdersGetParameterX77230d33.Serializer::class)
public sealed class InlineV1IssuingCardholdersGetParameterX77230d33 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1IssuingCardholdersGetParameterX77230d33() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `blocked`.
   */
  public data object Blocked : InlineV1IssuingCardholdersGetParameterX77230d33() {
    public override val `value`: String = "blocked"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineV1IssuingCardholdersGetParameterX77230d33() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardholdersGetParameterX77230d33()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardholdersGetParameterX77230d33 = when (value) {
      Active.value -> Active
      Blocked.value -> Blocked
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingCardholdersGetParameterX77230d33> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersGetParameterX77230d33", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersGetParameterX77230d33 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersGetParameterX77230d33) {
      encoder.encodeString(value.value)
    }
  }
}
