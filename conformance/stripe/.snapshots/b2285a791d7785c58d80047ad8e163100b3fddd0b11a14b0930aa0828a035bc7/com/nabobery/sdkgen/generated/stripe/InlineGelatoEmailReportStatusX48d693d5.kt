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
 * Status of this `email` check.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_email_report/properties/status
 */
@Serializable(with = InlineGelatoEmailReportStatusX48d693d5.Serializer::class)
public sealed class InlineGelatoEmailReportStatusX48d693d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unverified`.
   */
  public data object Unverified : InlineGelatoEmailReportStatusX48d693d5() {
    public override val `value`: String = "unverified"
  }

  /**
   * Documented value. Wire value: `verified`.
   */
  public data object Verified : InlineGelatoEmailReportStatusX48d693d5() {
    public override val `value`: String = "verified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoEmailReportStatusX48d693d5()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoEmailReportStatusX48d693d5 = when (value) {
      Unverified.value -> Unverified
      Verified.value -> Verified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGelatoEmailReportStatusX48d693d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoEmailReportStatusX48d693d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoEmailReportStatusX48d693d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoEmailReportStatusX48d693d5) {
      encoder.encodeString(value.value)
    }
  }
}
