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
 * Whether the inclusion was defined at the organization or enterprise level
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/oidc-custom-property-inclusion/properties/inclusion_source
 */
@Serializable(with = InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace.Serializer::class)
public sealed class InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace() {
    public override val `value`: String = "enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace()

  public companion object {
    public fun fromValue(`value`: String): InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace = when (value) {
      Organization.value -> Organization
      Enterprise.value -> Enterprise
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOidcCustomPropertyInclusionInclusionSourceX2b4e3ace) {
      encoder.encodeString(value.value)
    }
  }
}
