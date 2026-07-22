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
 * Denotes whether an email is publicly visible.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1email~1visibility/patch/requestBody/content/application~1json/schema/prop
 * erties/visibility
 */
@Serializable(with = InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a.Serializer::class)
public sealed class InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a() {
    public override val `value`: String = "private"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a()

  public companion object {
    public fun fromValue(`value`: String): InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a = when (value) {
      Public.value -> Public
      Private.value -> Private
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a) {
      encoder.encodeString(value.value)
    }
  }
}
