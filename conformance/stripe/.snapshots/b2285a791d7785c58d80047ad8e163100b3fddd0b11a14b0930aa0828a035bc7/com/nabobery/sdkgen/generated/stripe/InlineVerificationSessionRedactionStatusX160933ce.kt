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
 * Indicates whether this object and its related objects have been redacted or not.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/verification_session_redaction/properties/status
 */
@Serializable(with = InlineVerificationSessionRedactionStatusX160933ce.Serializer::class)
public sealed class InlineVerificationSessionRedactionStatusX160933ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineVerificationSessionRedactionStatusX160933ce() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `redacted`.
   */
  public data object Redacted : InlineVerificationSessionRedactionStatusX160933ce() {
    public override val `value`: String = "redacted"
  }

  /**
   * Documented value. Wire value: `validated`.
   */
  public data object Validated : InlineVerificationSessionRedactionStatusX160933ce() {
    public override val `value`: String = "validated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineVerificationSessionRedactionStatusX160933ce()

  public companion object {
    public fun fromValue(`value`: String): InlineVerificationSessionRedactionStatusX160933ce = when (value) {
      Processing.value -> Processing
      Redacted.value -> Redacted
      Validated.value -> Validated
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineVerificationSessionRedactionStatusX160933ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineVerificationSessionRedactionStatusX160933ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineVerificationSessionRedactionStatusX160933ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineVerificationSessionRedactionStatusX160933ce) {
      encoder.encodeString(value.value)
    }
  }
}
