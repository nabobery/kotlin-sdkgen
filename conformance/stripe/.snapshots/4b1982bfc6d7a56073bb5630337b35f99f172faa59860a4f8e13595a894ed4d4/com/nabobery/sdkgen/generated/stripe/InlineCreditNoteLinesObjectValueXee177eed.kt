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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/lines/properties/object
 */
@Serializable(with = InlineCreditNoteLinesObjectValueXee177eed.Serializer::class)
public sealed class InlineCreditNoteLinesObjectValueXee177eed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineCreditNoteLinesObjectValueXee177eed() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreditNoteLinesObjectValueXee177eed()

  public companion object {
    public fun fromValue(`value`: String): InlineCreditNoteLinesObjectValueXee177eed = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteLinesObjectValueXee177eed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCreditNoteLinesObjectValueXee177eed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreditNoteLinesObjectValueXee177eed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteLinesObjectValueXee177eed) {
      encoder.encodeString(value.value)
    }
  }
}
