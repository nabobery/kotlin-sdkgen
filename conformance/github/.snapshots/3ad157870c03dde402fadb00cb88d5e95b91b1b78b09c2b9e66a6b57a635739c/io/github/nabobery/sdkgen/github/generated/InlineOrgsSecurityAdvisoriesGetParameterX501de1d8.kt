package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1security-advisories/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1security-advisories/get/parameters/2/schema
 */
@Serializable(with = InlineOrgsSecurityAdvisoriesGetParameterX501de1d8.Serializer::class)
public sealed class InlineOrgsSecurityAdvisoriesGetParameterX501de1d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineOrgsSecurityAdvisoriesGetParameterX501de1d8() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineOrgsSecurityAdvisoriesGetParameterX501de1d8() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineOrgsSecurityAdvisoriesGetParameterX501de1d8() {
    public override val `value`: String = "published"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsSecurityAdvisoriesGetParameterX501de1d8()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsSecurityAdvisoriesGetParameterX501de1d8 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Published.value -> Published
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsSecurityAdvisoriesGetParameterX501de1d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsSecurityAdvisoriesGetParameterX501de1d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsSecurityAdvisoriesGetParameterX501de1d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecurityAdvisoriesGetParameterX501de1d8) {
      encoder.encodeString(value.value)
    }
  }
}
