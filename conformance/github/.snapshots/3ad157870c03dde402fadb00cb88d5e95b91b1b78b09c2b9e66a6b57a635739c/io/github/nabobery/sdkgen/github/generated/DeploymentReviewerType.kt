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
 * The type of reviewer.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-reviewer-type
 */
@Serializable(with = DeploymentReviewerType.Serializer::class)
public sealed class DeploymentReviewerType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : DeploymentReviewerType() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : DeploymentReviewerType() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : DeploymentReviewerType()

  public companion object {
    public fun fromValue(`value`: String): DeploymentReviewerType = when (value) {
      User.value -> User
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<DeploymentReviewerType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.DeploymentReviewerType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): DeploymentReviewerType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: DeploymentReviewerType) {
      encoder.encodeString(value.value)
    }
  }
}
