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
 * The process in which the Page will be built.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/page/properties/build_type
 */
@Serializable(with = InlinePageBuildTypeX12695bb1.Serializer::class)
public sealed class InlinePageBuildTypeX12695bb1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `legacy`.
   */
  public data object Legacy : InlinePageBuildTypeX12695bb1() {
    public override val `value`: String = "legacy"
  }

  /**
   * Documented value. Wire value: `workflow`.
   */
  public data object Workflow : InlinePageBuildTypeX12695bb1() {
    public override val `value`: String = "workflow"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePageBuildTypeX12695bb1()

  public companion object {
    public fun fromValue(`value`: String): InlinePageBuildTypeX12695bb1 = when (value) {
      Legacy.value -> Legacy
      Workflow.value -> Workflow
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePageBuildTypeX12695bb1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePageBuildTypeX12695bb1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePageBuildTypeX12695bb1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePageBuildTypeX12695bb1) {
      encoder.encodeString(value.value)
    }
  }
}
