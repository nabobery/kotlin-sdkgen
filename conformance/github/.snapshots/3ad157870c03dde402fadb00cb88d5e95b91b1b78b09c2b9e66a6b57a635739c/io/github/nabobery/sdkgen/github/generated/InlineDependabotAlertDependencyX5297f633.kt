package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Details for the vulnerable dependency.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert/properties/dependency
 */
@Serializable(with = InlineDependabotAlertDependencyX5297f633.Serializer::class)
public class InlineDependabotAlertDependencyX5297f633(
  /**
   * The full path to the dependency manifest file, relative to the root of the repository.
   */
  public val manifestPath: String? = null,
  public val packageValue: DependabotAlertPackage? = null,
  /**
   * The vulnerable dependency's relationship to your project.
   *
   * > [!NOTE]
   * > We are rolling out support for dependency relationship across ecosystems. This value will be "unknown" for all
   * dependencies in unsupported ecosystems.
   *
   */
  public val relationship: InlineDependabotAlertDependencyRelationshipXe8c6142f? = null,
  /**
   * The execution scope of the vulnerable dependency.
   */
  public val scope: InlineDependabotAlertDependencyScopeX04027c86? = null,
) {
  public class Builder {
    /**
     * The full path to the dependency manifest file, relative to the root of the repository.
     */
    public var manifestPath: String? = null

    public var packageValue: DependabotAlertPackage? = null

    /**
     * The vulnerable dependency's relationship to your project.
     *
     * > [!NOTE]
     * > We are rolling out support for dependency relationship across ecosystems. This value will be "unknown" for all
     * dependencies in unsupported ecosystems.
     *
     */
    public var relationship: InlineDependabotAlertDependencyRelationshipXe8c6142f? = null

    /**
     * The execution scope of the vulnerable dependency.
     */
    public var scope: InlineDependabotAlertDependencyScopeX04027c86? = null

    public fun build(): InlineDependabotAlertDependencyX5297f633 = InlineDependabotAlertDependencyX5297f633(
      manifestPath = manifestPath,
      packageValue = packageValue,
      relationship = relationship,
      scope = scope,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependabotAlertDependencyX5297f633 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDependabotAlertDependencyX5297f633> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependabotAlertDependencyX5297f633 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependabotAlertDependencyX5297f633")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependabotAlertDependencyX5297f633 must be a JSON object")
      return InlineDependabotAlertDependencyX5297f633(
        manifestPath = rawObject["manifest_path"]?.let { json.decodeFromJsonElement<String>(it) },
        packageValue = rawObject["package"]?.let { json.decodeFromJsonElement<DependabotAlertPackage>(it) },
        relationship = rawObject["relationship"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDependabotAlertDependencyRelationshipXe8c6142f?>(element) },
        scope = rawObject["scope"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDependabotAlertDependencyScopeX04027c86?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertDependencyX5297f633) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependabotAlertDependencyX5297f633")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.manifestPath?.let { put("manifest_path", it) }
        value.packageValue?.let { put("package", json.encodeToJsonElement(it)) }
        value.relationship?.let { put("relationship", json.encodeToJsonElement(it)) }
        value.scope?.let { put("scope", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependabotAlertDependencyX5297f633(block: InlineDependabotAlertDependencyX5297f633.Builder.() -> Unit): InlineDependabotAlertDependencyX5297f633 = InlineDependabotAlertDependencyX5297f633.build(block)
