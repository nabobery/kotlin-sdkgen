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
 * The state of the milestone. Either `open` or `closed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones/post/requestBody/content/application~1json/s
 * chema/properties/state
 */
@Serializable(with = InlineReposMilestonesPostRequestJsonStateXb896e86f.Serializer::class)
public sealed class InlineReposMilestonesPostRequestJsonStateXb896e86f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposMilestonesPostRequestJsonStateXb896e86f() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineReposMilestonesPostRequestJsonStateXb896e86f() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposMilestonesPostRequestJsonStateXb896e86f()

  public companion object {
    public fun fromValue(`value`: String): InlineReposMilestonesPostRequestJsonStateXb896e86f = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposMilestonesPostRequestJsonStateXb896e86f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposMilestonesPostRequestJsonStateXb896e86f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposMilestonesPostRequestJsonStateXb896e86f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposMilestonesPostRequestJsonStateXb896e86f) {
      encoder.encodeString(value.value)
    }
  }
}
