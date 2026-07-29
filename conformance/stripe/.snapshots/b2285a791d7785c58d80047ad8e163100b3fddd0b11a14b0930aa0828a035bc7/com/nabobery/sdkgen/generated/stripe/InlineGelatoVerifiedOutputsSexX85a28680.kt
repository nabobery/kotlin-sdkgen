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
 * The user's verified sex.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_verified_outputs/properties/sex
 */
@Serializable(with = InlineGelatoVerifiedOutputsSexX85a28680.Serializer::class)
public sealed class InlineGelatoVerifiedOutputsSexX85a28680 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `[redacted]`.
   */
  public data object Redacted : InlineGelatoVerifiedOutputsSexX85a28680() {
    public override val `value`: String = "[redacted]"
  }

  /**
   * Documented value. Wire value: `female`.
   */
  public data object Female : InlineGelatoVerifiedOutputsSexX85a28680() {
    public override val `value`: String = "female"
  }

  /**
   * Documented value. Wire value: `male`.
   */
  public data object Male : InlineGelatoVerifiedOutputsSexX85a28680() {
    public override val `value`: String = "male"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineGelatoVerifiedOutputsSexX85a28680() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoVerifiedOutputsSexX85a28680()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoVerifiedOutputsSexX85a28680 = when (value) {
      Redacted.value -> Redacted
      Female.value -> Female
      Male.value -> Male
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGelatoVerifiedOutputsSexX85a28680> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoVerifiedOutputsSexX85a28680", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoVerifiedOutputsSexX85a28680 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoVerifiedOutputsSexX85a28680) {
      encoder.encodeString(value.value)
    }
  }
}
