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
 * The level of the annotation.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/output/properties/annotations/items/properties/annotation_level
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127.Serializer::class)
public sealed class InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notice`.
   */
  public data object Notice : InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127() {
    public override val `value`: String = "notice"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127() {
    public override val `value`: String = "failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127 = when (value) {
      Notice.value -> Notice
      Warning.value -> Warning
      Failure.value -> Failure
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127) {
      encoder.encodeString(value.value)
    }
  }
}
