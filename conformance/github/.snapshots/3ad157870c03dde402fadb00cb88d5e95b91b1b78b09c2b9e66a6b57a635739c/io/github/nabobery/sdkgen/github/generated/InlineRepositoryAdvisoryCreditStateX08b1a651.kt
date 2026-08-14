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
 * The state of the user's acceptance of the credit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-credit/properties/state
 */
@Serializable(with = InlineRepositoryAdvisoryCreditStateX08b1a651.Serializer::class)
public sealed class InlineRepositoryAdvisoryCreditStateX08b1a651 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `accepted`.
   */
  public data object Accepted : InlineRepositoryAdvisoryCreditStateX08b1a651() {
    public override val `value`: String = "accepted"
  }

  /**
   * Documented value. Wire value: `declined`.
   */
  public data object Declined : InlineRepositoryAdvisoryCreditStateX08b1a651() {
    public override val `value`: String = "declined"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineRepositoryAdvisoryCreditStateX08b1a651() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryAdvisoryCreditStateX08b1a651()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryAdvisoryCreditStateX08b1a651 = when (value) {
      Accepted.value -> Accepted
      Declined.value -> Declined
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryCreditStateX08b1a651> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryAdvisoryCreditStateX08b1a651", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryCreditStateX08b1a651 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryCreditStateX08b1a651) {
      encoder.encodeString(value.value)
    }
  }
}
