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
 * The type of the bypass reviewer
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items/properties/reviewer_type
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `TEAM`.
   */
  public data object Team : InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab() {
    public override val `value`: String = "TEAM"
  }

  /**
   * Documented value. Wire value: `ROLE`.
   */
  public data object Role : InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab() {
    public override val `value`: String = "ROLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab = when (value) {
      Team.value -> Team
      Role.value -> Role
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab) {
      encoder.encodeString(value.value)
    }
  }
}
