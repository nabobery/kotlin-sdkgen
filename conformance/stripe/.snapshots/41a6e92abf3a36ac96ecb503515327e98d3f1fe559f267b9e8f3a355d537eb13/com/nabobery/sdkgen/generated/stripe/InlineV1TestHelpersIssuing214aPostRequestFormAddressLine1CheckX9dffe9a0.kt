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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/address_line1_check.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/address_line1_check
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0.Serializer::class)
public sealed class InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `match`.
   */
  public data object Match : InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0() {
    public override val `value`: String = "match"
  }

  /**
   * Documented value. Wire value: `mismatch`.
   */
  public data object Mismatch : InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0() {
    public override val `value`: String = "mismatch"
  }

  /**
   * Documented value. Wire value: `not_provided`.
   */
  public data object NotProvided : InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0() {
    public override val `value`: String = "not_provided"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0 = when (value) {
      Match.value -> Match
      Mismatch.value -> Mismatch
      NotProvided.value -> NotProvided
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormAddressLine1CheckX9dffe9a0) {
      encoder.encodeString(value.value)
    }
  }
}
