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
 * The vulnerable dependency's relationship to your project.
 *
 * > [!NOTE]
 * > We are rolling out support for dependency relationship across ecosystems. This value will be "unknown" for all
 * dependencies in unsupported ecosystems.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-with-repository/properties/dependency/properties/re
 * lationship
 */
@Serializable(with = InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73.Serializer::class)
public sealed class InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `transitive`.
   */
  public data object Transitive : InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73() {
    public override val `value`: String = "transitive"
  }

  /**
   * Documented value. Wire value: `inconclusive`.
   */
  public data object Inconclusive : InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73() {
    public override val `value`: String = "inconclusive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73 = when (value) {
      Unknown.value -> Unknown
      Direct.value -> Direct
      Transitive.value -> Transitive
      Inconclusive.value -> Inconclusive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertWithRepositoryDependencyRelationshipXd025ef73) {
      encoder.encodeString(value.value)
    }
  }
}
