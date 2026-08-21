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
 * Source: sdkgen://source/openapi.json#/components/schemas/person/properties/object
 */
@Serializable(with = InlinePersonObjectValueXfffe50ab.Serializer::class)
public sealed class InlinePersonObjectValueXfffe50ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `person`.
   */
  public data object Person : InlinePersonObjectValueXfffe50ab() {
    public override val `value`: String = "person"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePersonObjectValueXfffe50ab()

  public companion object {
    public fun fromValue(`value`: String): InlinePersonObjectValueXfffe50ab = when (value) {
      Person.value -> Person
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePersonObjectValueXfffe50ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePersonObjectValueXfffe50ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePersonObjectValueXfffe50ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePersonObjectValueXfffe50ab) {
      encoder.encodeString(value.value)
    }
  }
}
