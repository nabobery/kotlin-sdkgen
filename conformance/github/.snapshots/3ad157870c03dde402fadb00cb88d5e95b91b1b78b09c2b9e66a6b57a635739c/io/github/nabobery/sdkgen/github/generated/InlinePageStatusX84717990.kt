package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The status of the most recent build of the Page.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/page/properties/status
 */
@Serializable(with = InlinePageStatusX84717990.Serializer::class)
public sealed class InlinePageStatusX84717990 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `built`.
   */
  public data object Built : InlinePageStatusX84717990() {
    public override val `value`: String = "built"
  }

  /**
   * Documented value. Wire value: `building`.
   */
  public data object Building : InlinePageStatusX84717990() {
    public override val `value`: String = "building"
  }

  /**
   * Documented value. Wire value: `errored`.
   */
  public data object Errored : InlinePageStatusX84717990() {
    public override val `value`: String = "errored"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePageStatusX84717990()

  public companion object {
    public fun fromValue(`value`: String): InlinePageStatusX84717990 = when (value) {
      Built.value -> Built
      Building.value -> Building
      Errored.value -> Errored
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePageStatusX84717990> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlinePageStatusX84717990", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePageStatusX84717990 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePageStatusX84717990) {
      encoder.encodeString(value.value)
    }
  }
}
