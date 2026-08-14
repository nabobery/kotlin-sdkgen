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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1security-advisories/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1security-advisories/get/parameters/6/schema
 */
@Serializable(with = InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4.Serializer::class)
public sealed class InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `triage`.
   */
  public data object Triage : InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4() {
    public override val `value`: String = "triage"
  }

  /**
   * Documented value. Wire value: `draft`.
   */
  public data object Draft : InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4() {
    public override val `value`: String = "draft"
  }

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4() {
    public override val `value`: String = "published"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4 = when (value) {
      Triage.value -> Triage
      Draft.value -> Draft
      Published.value -> Published
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4) {
      encoder.encodeString(value.value)
    }
  }
}
