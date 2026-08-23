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
 * The vulnerable dependency's relationship to your project.
 *
 * > [!NOTE]
 * > We are rolling out support for dependency relationship across ecosystems. This value will be "unknown" for all
 * dependencies in unsupported ecosystems.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert/properties/dependency/properties/relationship
 */
@Serializable(with = InlineDependabotAlertDependencyRelationshipXe8c6142f.Serializer::class)
public sealed class InlineDependabotAlertDependencyRelationshipXe8c6142f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineDependabotAlertDependencyRelationshipXe8c6142f() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineDependabotAlertDependencyRelationshipXe8c6142f() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `transitive`.
   */
  public data object Transitive : InlineDependabotAlertDependencyRelationshipXe8c6142f() {
    public override val `value`: String = "transitive"
  }

  /**
   * Documented value. Wire value: `inconclusive`.
   */
  public data object Inconclusive : InlineDependabotAlertDependencyRelationshipXe8c6142f() {
    public override val `value`: String = "inconclusive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertDependencyRelationshipXe8c6142f()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertDependencyRelationshipXe8c6142f = when (value) {
      Unknown.value -> Unknown
      Direct.value -> Direct
      Transitive.value -> Transitive
      Inconclusive.value -> Inconclusive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertDependencyRelationshipXe8c6142f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertDependencyRelationshipXe8c6142f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertDependencyRelationshipXe8c6142f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertDependencyRelationshipXe8c6142f) {
      encoder.encodeString(value.value)
    }
  }
}
