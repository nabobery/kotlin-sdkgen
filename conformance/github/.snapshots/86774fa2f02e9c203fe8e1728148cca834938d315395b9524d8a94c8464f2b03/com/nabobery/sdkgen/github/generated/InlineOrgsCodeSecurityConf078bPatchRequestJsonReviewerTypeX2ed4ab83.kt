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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items/pro
 * perties/reviewer_type
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `TEAM`.
   */
  public data object Team : InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83() {
    public override val `value`: String = "TEAM"
  }

  /**
   * Documented value. Wire value: `ROLE`.
   */
  public data object Role : InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83() {
    public override val `value`: String = "ROLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83 = when (value) {
      Team.value -> Team
      Role.value -> Role
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPatchRequestJsonReviewerTypeX2ed4ab83) {
      encoder.encodeString(value.value)
    }
  }
}
