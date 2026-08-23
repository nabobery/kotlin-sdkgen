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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.connection_token/properties/object
 */
@Serializable(with = InlineTerminalConnectionTokenObjectValueX834395da.Serializer::class)
public sealed class InlineTerminalConnectionTokenObjectValueX834395da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `terminal.connection_token`.
   */
  public data object TerminalConnectionToken : InlineTerminalConnectionTokenObjectValueX834395da() {
    public override val `value`: String = "terminal.connection_token"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalConnectionTokenObjectValueX834395da()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalConnectionTokenObjectValueX834395da = when (value) {
      TerminalConnectionToken.value -> TerminalConnectionToken
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTerminalConnectionTokenObjectValueX834395da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTerminalConnectionTokenObjectValueX834395da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalConnectionTokenObjectValueX834395da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalConnectionTokenObjectValueX834395da) {
      encoder.encodeString(value.value)
    }
  }
}
