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
 * The state of the advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update/properties/state
 */
@Serializable(with = InlineRepositoryAdvisoryUpdateStateXd365a7d6.Serializer::class)
public sealed class InlineRepositoryAdvisoryUpdateStateXd365a7d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineRepositoryAdvisoryUpdateStateXd365a7d6() {
    public override val `value`: String = "published"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineRepositoryAdvisoryUpdateStateXd365a7d6() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `draft`.
   */
  public data object Draft : InlineRepositoryAdvisoryUpdateStateXd365a7d6() {
    public override val `value`: String = "draft"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryAdvisoryUpdateStateXd365a7d6()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryAdvisoryUpdateStateXd365a7d6 = when (value) {
      Published.value -> Published
      Closed.value -> Closed
      Draft.value -> Draft
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryUpdateStateXd365a7d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryAdvisoryUpdateStateXd365a7d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryUpdateStateXd365a7d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryUpdateStateXd365a7d6) {
      encoder.encodeString(value.value)
    }
  }
}
