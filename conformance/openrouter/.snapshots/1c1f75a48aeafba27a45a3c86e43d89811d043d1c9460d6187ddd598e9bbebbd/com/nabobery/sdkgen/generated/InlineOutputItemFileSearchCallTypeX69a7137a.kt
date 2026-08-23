package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemFileSearchCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemFileSearchCall/properties/type
 */
@Serializable(with = InlineOutputItemFileSearchCallTypeX69a7137a.Serializer::class)
public sealed class InlineOutputItemFileSearchCallTypeX69a7137a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_search_call`.
   */
  public data object FileSearchCall : InlineOutputItemFileSearchCallTypeX69a7137a() {
    public override val `value`: String = "file_search_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemFileSearchCallTypeX69a7137a()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemFileSearchCallTypeX69a7137a = when (value) {
      FileSearchCall.value -> FileSearchCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemFileSearchCallTypeX69a7137a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemFileSearchCallTypeX69a7137a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemFileSearchCallTypeX69a7137a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemFileSearchCallTypeX69a7137a) {
      encoder.encodeString(value.value)
    }
  }
}
