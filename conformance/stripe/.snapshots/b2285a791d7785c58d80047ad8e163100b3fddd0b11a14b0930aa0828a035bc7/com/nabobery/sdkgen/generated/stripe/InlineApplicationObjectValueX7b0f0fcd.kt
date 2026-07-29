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
 * Source: sdkgen://source/openapi.json#/components/schemas/application/properties/object
 */
@Serializable(with = InlineApplicationObjectValueX7b0f0fcd.Serializer::class)
public sealed class InlineApplicationObjectValueX7b0f0fcd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `application`.
   */
  public data object Application : InlineApplicationObjectValueX7b0f0fcd() {
    public override val `value`: String = "application"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplicationObjectValueX7b0f0fcd()

  public companion object {
    public fun fromValue(`value`: String): InlineApplicationObjectValueX7b0f0fcd = when (value) {
      Application.value -> Application
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineApplicationObjectValueX7b0f0fcd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineApplicationObjectValueX7b0f0fcd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplicationObjectValueX7b0f0fcd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplicationObjectValueX7b0f0fcd) {
      encoder.encodeString(value.value)
    }
  }
}
