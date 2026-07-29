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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/parameters/org-security-product-enablement/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/org-security-product-enablement/schema
 */
@Serializable(with = InlineOrgSecurityProductEnablementParameterX0e793e43.Serializer::class)
public sealed class InlineOrgSecurityProductEnablementParameterX0e793e43 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enable_all`.
   */
  public data object EnableAll : InlineOrgSecurityProductEnablementParameterX0e793e43() {
    public override val `value`: String = "enable_all"
  }

  /**
   * Documented value. Wire value: `disable_all`.
   */
  public data object DisableAll : InlineOrgSecurityProductEnablementParameterX0e793e43() {
    public override val `value`: String = "disable_all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgSecurityProductEnablementParameterX0e793e43()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgSecurityProductEnablementParameterX0e793e43 = when (value) {
      EnableAll.value -> EnableAll
      DisableAll.value -> DisableAll
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgSecurityProductEnablementParameterX0e793e43> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgSecurityProductEnablementParameterX0e793e43", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgSecurityProductEnablementParameterX0e793e43 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgSecurityProductEnablementParameterX0e793e43) {
      encoder.encodeString(value.value)
    }
  }
}
