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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1security-advisories/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1security-advisories/get/parameters/3/schema
 */
@Serializable(with = InlineReposSecurityAdvisoriesGetParameterX3cc08ffc.Serializer::class)
public sealed class InlineReposSecurityAdvisoriesGetParameterX3cc08ffc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineReposSecurityAdvisoriesGetParameterX3cc08ffc() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineReposSecurityAdvisoriesGetParameterX3cc08ffc() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineReposSecurityAdvisoriesGetParameterX3cc08ffc() {
    public override val `value`: String = "published"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposSecurityAdvisoriesGetParameterX3cc08ffc()

  public companion object {
    public fun fromValue(`value`: String): InlineReposSecurityAdvisoriesGetParameterX3cc08ffc = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Published.value -> Published
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposSecurityAdvisoriesGetParameterX3cc08ffc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposSecurityAdvisoriesGetParameterX3cc08ffc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposSecurityAdvisoriesGetParameterX3cc08ffc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposSecurityAdvisoriesGetParameterX3cc08ffc) {
      encoder.encodeString(value.value)
    }
  }
}
