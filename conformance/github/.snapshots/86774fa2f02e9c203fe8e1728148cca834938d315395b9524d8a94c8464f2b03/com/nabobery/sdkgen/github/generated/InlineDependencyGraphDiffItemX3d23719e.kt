package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-diff/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-diff/items
 */
@Serializable(with = InlineDependencyGraphDiffItemX3d23719e.Serializer::class)
public class InlineDependencyGraphDiffItemX3d23719e(
  public val changeType: InlineDependencyGraphDiffItemChangeTypeXf17dfac7,
  public val ecosystem: String,
  public val license: String?,
  public val manifest: String,
  public val name: String,
  public val packageUrl: String?,
  /**
   * Where the dependency is utilized. `development` means that the dependency is only utilized in the development
   * environment. `runtime` means that the dependency is utilized at runtime and in the development environment.
   */
  public val scope: InlineDependencyGraphDiffItemScopeXc6e6335b,
  public val sourceRepositoryUrl: String?,
  public val version: String,
  vulnerabilities: List<InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b>,
) {
  public val vulnerabilities: List<InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b> =
      vulnerabilities.toList()

  public class Builder {
    private var changeTypeValue: InlineDependencyGraphDiffItemChangeTypeXf17dfac7? = null

    public var changeType: InlineDependencyGraphDiffItemChangeTypeXf17dfac7
      get() = requireNotNull(changeTypeValue) { "changeType is required" }
      set(`value`) {
        changeTypeValue = value
      }

    private var ecosystemValue: String? = null

    public var ecosystem: String
      get() = requireNotNull(ecosystemValue) { "ecosystem is required" }
      set(`value`) {
        ecosystemValue = value
      }

    private var manifestValue: String? = null

    public var manifest: String
      get() = requireNotNull(manifestValue) { "manifest is required" }
      set(`value`) {
        manifestValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var scopeValue: InlineDependencyGraphDiffItemScopeXc6e6335b? = null

    public var scope: InlineDependencyGraphDiffItemScopeXc6e6335b
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    private var versionValue: String? = null

    public var version: String
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    private var vulnerabilitiesValue:
        List<InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b>? = null

    public var vulnerabilities: List<InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b>
      get() = requireNotNull(vulnerabilitiesValue) { "vulnerabilities is required" }.toList()
      set(`value`) {
        vulnerabilitiesValue = value.toList()
      }

    private var licenseState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var license: String?
      get() = licenseState.valueOrNull()
      set(`value`) {
        licenseState = value.toNullableFieldState()
      }

    private var packageUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var packageUrl: String?
      get() = packageUrlState.valueOrNull()
      set(`value`) {
        packageUrlState = value.toNullableFieldState()
      }

    private var sourceRepositoryUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var sourceRepositoryUrl: String?
      get() = sourceRepositoryUrlState.valueOrNull()
      set(`value`) {
        sourceRepositoryUrlState = value.toNullableFieldState()
      }

    public fun build(): InlineDependencyGraphDiffItemX3d23719e {
      check(changeTypeValue != null) { "changeType is required" }
      check(ecosystemValue != null) { "ecosystem is required" }
      check(manifestValue != null) { "manifest is required" }
      check(nameValue != null) { "name is required" }
      check(scopeValue != null) { "scope is required" }
      check(versionValue != null) { "version is required" }
      check(vulnerabilitiesValue != null) { "vulnerabilities is required" }
      check(licenseState !== FieldState.Absent) { "license is required, even when null" }
      check(packageUrlState !== FieldState.Absent) { "packageUrl is required, even when null" }
      check(sourceRepositoryUrlState !== FieldState.Absent) { "sourceRepositoryUrl is required, even when null" }
      return InlineDependencyGraphDiffItemX3d23719e(
        changeType = changeType,
        ecosystem = ecosystem,
        license = licenseState.valueOrNull(),
        manifest = manifest,
        name = name,
        packageUrl = packageUrlState.valueOrNull(),
        scope = scope,
        sourceRepositoryUrl = sourceRepositoryUrlState.valueOrNull(),
        version = version,
        vulnerabilities = vulnerabilities,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependencyGraphDiffItemX3d23719e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineDependencyGraphDiffItemX3d23719e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependencyGraphDiffItemX3d23719e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependencyGraphDiffItemX3d23719e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependencyGraphDiffItemX3d23719e must be a JSON object")
      val changeType = json.decodeRequired<InlineDependencyGraphDiffItemChangeTypeXf17dfac7>(rawObject, "change_type")
      val ecosystem = json.decodeRequired<String>(rawObject, "ecosystem")
      val manifest = json.decodeRequired<String>(rawObject, "manifest")
      val name = json.decodeRequired<String>(rawObject, "name")
      val scope = json.decodeRequired<InlineDependencyGraphDiffItemScopeXc6e6335b>(rawObject, "scope")
      val version = json.decodeRequired<String>(rawObject, "version")
      val vulnerabilities = json.decodeRequired<List<InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b>>(rawObject, "vulnerabilities")
      if (!rawObject.containsKey("license")) {
        throw SerializationException("InlineDependencyGraphDiffItemX3d23719e is missing required property 'license'")
      }
      val license = rawObject["license"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("package_url")) {
        throw SerializationException("InlineDependencyGraphDiffItemX3d23719e is missing required property 'package_url'")
      }
      val packageUrl = rawObject["package_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("source_repository_url")) {
        throw SerializationException("InlineDependencyGraphDiffItemX3d23719e is missing required property 'source_repository_url'")
      }
      val sourceRepositoryUrl = rawObject["source_repository_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineDependencyGraphDiffItemX3d23719e(
        changeType = changeType,
        ecosystem = ecosystem,
        license = license,
        manifest = manifest,
        name = name,
        packageUrl = packageUrl,
        scope = scope,
        sourceRepositoryUrl = sourceRepositoryUrl,
        version = version,
        vulnerabilities = vulnerabilities,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphDiffItemX3d23719e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependencyGraphDiffItemX3d23719e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("change_type", json.encodeToJsonElement(value.changeType))
        put("ecosystem", value.ecosystem)
        put("license", value.license?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("manifest", value.manifest)
        put("name", value.name)
        put("package_url", value.packageUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("scope", json.encodeToJsonElement(value.scope))
        put("source_repository_url", value.sourceRepositoryUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("version", value.version)
        put("vulnerabilities", json.encodeToJsonElement(value.vulnerabilities))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependencyGraphDiffItemX3d23719e(block: InlineDependencyGraphDiffItemX3d23719e.Builder.() -> Unit): InlineDependencyGraphDiffItemX3d23719e = InlineDependencyGraphDiffItemX3d23719e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependencyGraphDiffItemX3d23719e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineDependencyGraphDiffItemX3d23719e property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
