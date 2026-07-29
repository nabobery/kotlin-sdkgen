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
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/object
 */
@Serializable(with = InlineSetupIntentObjectValueX2703e05e.Serializer::class)
public sealed class InlineSetupIntentObjectValueX2703e05e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `setup_intent`.
   */
  public data object SetupIntent : InlineSetupIntentObjectValueX2703e05e() {
    public override val `value`: String = "setup_intent"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentObjectValueX2703e05e()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentObjectValueX2703e05e = when (value) {
      SetupIntent.value -> SetupIntent
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentObjectValueX2703e05e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentObjectValueX2703e05e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentObjectValueX2703e05e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentObjectValueX2703e05e) {
      encoder.encodeString(value.value)
    }
  }
}
