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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/output/properties/annotations/items/properties/annotation_level
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9.Serializer::class)
public sealed class InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `notice`.
   */
  public data object Notice : InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9() {
    public override val `value`: String = "notice"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9() {
    public override val `value`: String = "failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9 = when (value) {
      Notice.value -> Notice
      Warning.value -> Warning
      Failure.value -> Failure
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9) {
      encoder.encodeString(value.value)
    }
  }
}
