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
 * The level at which the comment is targeted.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments/post/requestBody/content
 * /application~1json/schema/properties/subject_type
 */
@Serializable(with = InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec.Serializer::class)
public sealed class InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `line`.
   */
  public data object Line : InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec() {
    public override val `value`: String = "line"
  }

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec = when (value) {
      Line.value -> Line
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsPostRequestJsonSubjectTypeXe50ad3ec) {
      encoder.encodeString(value.value)
    }
  }
}
