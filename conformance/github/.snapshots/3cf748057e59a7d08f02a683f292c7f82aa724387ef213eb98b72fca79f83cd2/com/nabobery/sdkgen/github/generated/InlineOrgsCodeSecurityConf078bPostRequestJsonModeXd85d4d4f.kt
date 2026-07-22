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
 * The bypass mode for the reviewer
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items/properties/mode
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ALWAYS`.
   */
  public data object Always : InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f() {
    public override val `value`: String = "ALWAYS"
  }

  /**
   * Documented value. Wire value: `EXEMPT`.
   */
  public data object Exempt : InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f() {
    public override val `value`: String = "EXEMPT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f = when (value) {
      Always.value -> Always
      Exempt.value -> Exempt
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f) {
      encoder.encodeString(value.value)
    }
  }
}
