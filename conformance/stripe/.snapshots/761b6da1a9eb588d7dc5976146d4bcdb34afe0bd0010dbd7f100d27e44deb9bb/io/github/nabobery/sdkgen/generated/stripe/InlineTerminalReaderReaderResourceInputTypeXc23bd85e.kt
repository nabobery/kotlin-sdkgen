package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Type of input being collected.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_input/properties/type
 */
@Serializable(with = InlineTerminalReaderReaderResourceInputTypeXc23bd85e.Serializer::class)
public sealed class InlineTerminalReaderReaderResourceInputTypeXc23bd85e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `email`.
   */
  public data object Email : InlineTerminalReaderReaderResourceInputTypeXc23bd85e() {
    public override val `value`: String = "email"
  }

  /**
   * Documented value. Wire value: `numeric`.
   */
  public data object Numeric : InlineTerminalReaderReaderResourceInputTypeXc23bd85e() {
    public override val `value`: String = "numeric"
  }

  /**
   * Documented value. Wire value: `phone`.
   */
  public data object Phone : InlineTerminalReaderReaderResourceInputTypeXc23bd85e() {
    public override val `value`: String = "phone"
  }

  /**
   * Documented value. Wire value: `selection`.
   */
  public data object Selection : InlineTerminalReaderReaderResourceInputTypeXc23bd85e() {
    public override val `value`: String = "selection"
  }

  /**
   * Documented value. Wire value: `signature`.
   */
  public data object Signature : InlineTerminalReaderReaderResourceInputTypeXc23bd85e() {
    public override val `value`: String = "signature"
  }

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineTerminalReaderReaderResourceInputTypeXc23bd85e() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalReaderReaderResourceInputTypeXc23bd85e()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalReaderReaderResourceInputTypeXc23bd85e = when (value) {
      Email.value -> Email
      Numeric.value -> Numeric
      Phone.value -> Phone
      Selection.value -> Selection
      Signature.value -> Signature
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTerminalReaderReaderResourceInputTypeXc23bd85e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTerminalReaderReaderResourceInputTypeXc23bd85e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceInputTypeXc23bd85e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceInputTypeXc23bd85e) {
      encoder.encodeString(value.value)
    }
  }
}
