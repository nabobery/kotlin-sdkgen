package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/dependency.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency
 */
@Serializable(with = Dependency.Serializer::class)
public class Dependency(
  dependencies: List<String>? = null,
  metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? = null,
  /**
   * Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details.
   */
  public val packageUrl: String? = null,
  /**
   * A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency.
   */
  public val relationship: InlineDependencyRelationshipX0ca4becb? = null,
  /**
   * A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for
   * development. Future versions of this specification may allow for more granular scopes.
   */
  public val scope: InlineDependencyScopeX93459636? = null,
) {
  /**
   * Array of package-url (PURLs) of direct child dependencies.
   */
  public val dependencies: List<String>? = dependencies?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? =
      metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var dependenciesValue: List<String>? = null

    /**
     * Array of package-url (PURLs) of direct child dependencies.
     */
    public var dependencies: List<String>?
      get() = dependenciesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        dependenciesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? = null

    public var metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details.
     */
    public var packageUrl: String? = null

    /**
     * A notation of whether a dependency is requested directly by this manifest or is a dependency of another
     * dependency.
     */
    public var relationship: InlineDependencyRelationshipX0ca4becb? = null

    /**
     * A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for
     * development. Future versions of this specification may allow for more granular scopes.
     */
    public var scope: InlineDependencyScopeX93459636? = null

    public fun build(): Dependency = Dependency(
      dependencies = dependencies,
      metadata = metadata,
      packageUrl = packageUrl,
      relationship = relationship,
      scope = scope,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Dependency = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Dependency> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Dependency {
      val jsonDecoder = decoder.requireJsonDecoder("Dependency")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Dependency must be a JSON object")
      return Dependency(
        dependencies = rawObject["dependencies"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, InlineMetadataAdditionalValueXa8c346f6?>>(it) },
        packageUrl = rawObject["package_url"]?.let { json.decodeFromJsonElement<String>(it) },
        relationship = rawObject["relationship"]?.let { json.decodeFromJsonElement<InlineDependencyRelationshipX0ca4becb>(it) },
        scope = rawObject["scope"]?.let { json.decodeFromJsonElement<InlineDependencyScopeX93459636>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Dependency) {
      val jsonEncoder = encoder.requireJsonEncoder("Dependency")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dependencies?.let { put("dependencies", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.packageUrl?.let { put("package_url", it) }
        value.relationship?.let { put("relationship", json.encodeToJsonElement(it)) }
        value.scope?.let { put("scope", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun dependency(block: Dependency.Builder.() -> Unit): Dependency = Dependency.build(block)
