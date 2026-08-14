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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt/properties/object
 */
@Serializable(with = InlineSetupAttemptObjectValueX942b9149.Serializer::class)
public sealed class InlineSetupAttemptObjectValueX942b9149 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `setup_attempt`.
   */
  public data object SetupAttempt : InlineSetupAttemptObjectValueX942b9149() {
    public override val `value`: String = "setup_attempt"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupAttemptObjectValueX942b9149()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupAttemptObjectValueX942b9149 = when (value) {
      SetupAttempt.value -> SetupAttempt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptObjectValueX942b9149> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupAttemptObjectValueX942b9149", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupAttemptObjectValueX942b9149 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptObjectValueX942b9149) {
      encoder.encodeString(value.value)
    }
  }
}
