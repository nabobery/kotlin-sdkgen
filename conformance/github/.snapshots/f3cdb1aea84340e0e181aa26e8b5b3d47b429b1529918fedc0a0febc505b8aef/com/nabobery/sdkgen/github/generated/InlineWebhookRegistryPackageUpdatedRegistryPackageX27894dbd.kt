package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/registry_package
 */
@Serializable(with = InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd.Serializer::class)
public class InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd(
  public val createdAt: String,
  public val description: JsonElement?,
  public val ecosystem: String,
  public val htmlUrl: String,
  public val id: Int,
  public val name: String,
  public val namespace: String,
  public val owner: InlineWebhookRegistryPackageUpdatedRegistryPackageOwnerX3c6bdb5b,
  public val packageType: String,
  public val packageVersion:
      InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436,
  public val registry: JsonObject?,
  public val updatedAt: String,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var ecosystemValue: String? = null

    public var ecosystem: String
      get() = requireNotNull(ecosystemValue) { "ecosystem is required" }
      set(`value`) {
        ecosystemValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var namespaceValue: String? = null

    public var namespace: String
      get() = requireNotNull(namespaceValue) { "namespace is required" }
      set(`value`) {
        namespaceValue = value
      }

    private var ownerValue: InlineWebhookRegistryPackageUpdatedRegistryPackageOwnerX3c6bdb5b? = null

    public var owner: InlineWebhookRegistryPackageUpdatedRegistryPackageOwnerX3c6bdb5b
      get() = requireNotNull(ownerValue) { "owner is required" }
      set(`value`) {
        ownerValue = value
      }

    private var packageTypeValue: String? = null

    public var packageType: String
      get() = requireNotNull(packageTypeValue) { "packageType is required" }
      set(`value`) {
        packageTypeValue = value
      }

    private var packageVersionValue:
        InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436? = null

    public var packageVersion:
        InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436
      get() = requireNotNull(packageVersionValue) { "packageVersion is required" }
      set(`value`) {
        packageVersionValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var descriptionState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: JsonElement?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var registryState: FieldState<JsonObject?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var registry: JsonObject?
      get() = registryState.valueOrNull()
      set(`value`) {
        registryState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd {
      check(createdAtValue != null) { "createdAt is required" }
      check(ecosystemValue != null) { "ecosystem is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(namespaceValue != null) { "namespace is required" }
      check(ownerValue != null) { "owner is required" }
      check(packageTypeValue != null) { "packageType is required" }
      check(packageVersionValue != null) { "packageVersion is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(registryState !== FieldState.Absent) { "registry is required, even when null" }
      return InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd(
        createdAt = createdAt,
        description = descriptionState.valueOrNull(),
        ecosystem = ecosystem,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        namespace = namespace,
        owner = owner,
        packageType = packageType,
        packageVersion = packageVersion,
        registry = registryState.valueOrNull(),
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val ecosystem = json.decodeRequired<String>(rawObject, "ecosystem")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val namespace = json.decodeRequired<String>(rawObject, "namespace")
      val owner = json.decodeRequired<InlineWebhookRegistryPackageUpdatedRegistryPackageOwnerX3c6bdb5b>(rawObject, "owner")
      val packageType = json.decodeRequired<String>(rawObject, "package_type")
      val packageVersion = json.decodeRequired<InlineWebhookRegistryPackageUpdatedRegistryPackagePackageVersionX0b295436>(rawObject, "package_version")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(requireNotNull(element)) }
      if (!rawObject.containsKey("registry")) {
        throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd is missing required property 'registry'")
      }
      val registry = rawObject["registry"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonObject?>(requireNotNull(element)) }
      return InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd(
        createdAt = createdAt,
        description = description,
        ecosystem = ecosystem,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        namespace = namespace,
        owner = owner,
        packageType = packageType,
        packageVersion = packageVersion,
        registry = registry,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ecosystem", value.ecosystem)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("namespace", value.namespace)
        put("owner", json.encodeToJsonElement(value.owner))
        put("package_type", value.packageType)
        put("package_version", json.encodeToJsonElement(value.packageVersion))
        put("registry", value.registry?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd(block: InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd.Builder.() -> Unit): InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd = InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookRegistryPackageUpdatedRegistryPackageX27894dbd property '" + name + "' is not nullable")
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
