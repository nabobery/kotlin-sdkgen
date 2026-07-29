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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_person/properties/object
 */
@Serializable(with = InlineDeletedPersonObjectValueXe0055510.Serializer::class)
public sealed class InlineDeletedPersonObjectValueXe0055510 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `person`.
   */
  public data object Person : InlineDeletedPersonObjectValueXe0055510() {
    public override val `value`: String = "person"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedPersonObjectValueXe0055510()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedPersonObjectValueXe0055510 = when (value) {
      Person.value -> Person
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDeletedPersonObjectValueXe0055510> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedPersonObjectValueXe0055510", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedPersonObjectValueXe0055510 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedPersonObjectValueXe0055510) {
      encoder.encodeString(value.value)
    }
  }
}
