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
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.configuration/properties/object
 */
@Serializable(with = InlineTerminalConfigurationObjectValueX97cf5af6.Serializer::class)
public sealed class InlineTerminalConfigurationObjectValueX97cf5af6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `terminal.configuration`.
   */
  public data object TerminalConfiguration : InlineTerminalConfigurationObjectValueX97cf5af6() {
    public override val `value`: String = "terminal.configuration"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalConfigurationObjectValueX97cf5af6()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalConfigurationObjectValueX97cf5af6 = when (value) {
      TerminalConfiguration.value -> TerminalConfiguration
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTerminalConfigurationObjectValueX97cf5af6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTerminalConfigurationObjectValueX97cf5af6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalConfigurationObjectValueX97cf5af6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalConfigurationObjectValueX97cf5af6) {
      encoder.encodeString(value.value)
    }
  }
}
