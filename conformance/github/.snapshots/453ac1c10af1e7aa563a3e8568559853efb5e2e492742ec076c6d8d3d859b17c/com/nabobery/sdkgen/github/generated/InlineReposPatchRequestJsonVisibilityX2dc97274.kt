package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The visibility of the repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/visibility
 */
@Serializable(with = InlineReposPatchRequestJsonVisibilityX2dc97274.Serializer::class)
public sealed class InlineReposPatchRequestJsonVisibilityX2dc97274 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineReposPatchRequestJsonVisibilityX2dc97274() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineReposPatchRequestJsonVisibilityX2dc97274() {
    public override val `value`: String = "private"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPatchRequestJsonVisibilityX2dc97274()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPatchRequestJsonVisibilityX2dc97274 = when (value) {
      Public.value -> Public
      Private.value -> Private
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposPatchRequestJsonVisibilityX2dc97274> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPatchRequestJsonVisibilityX2dc97274", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonVisibilityX2dc97274 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonVisibilityX2dc97274) {
      encoder.encodeString(value.value)
    }
  }
}
