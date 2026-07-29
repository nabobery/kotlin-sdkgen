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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package
 */
@Serializable(with = InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c.Serializer::class)
public class InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c(
  public val createdAt: String?,
  public val description: String?,
  public val ecosystem: String,
  public val htmlUrl: String,
  public val id: Int,
  public val name: String,
  public val namespace: String,
  public val owner: InlineWebhookRegistryPackagePublishedRegistryPackageOwnerXf3db4a7a,
  public val packageType: String,
  public val packageVersion:
      InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7?,
  public val registry: InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4?,
  public val updatedAt: String?,
) {
  public class Builder {
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

    private var ownerValue: InlineWebhookRegistryPackagePublishedRegistryPackageOwnerXf3db4a7a? =
        null

    public var owner: InlineWebhookRegistryPackagePublishedRegistryPackageOwnerXf3db4a7a
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

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var packageVersionState:
        FieldState<InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var packageVersion:
        InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7?
      get() = packageVersionState.valueOrNull()
      set(`value`) {
        packageVersionState = value.toNullableFieldState()
      }

    private var registryState:
        FieldState<InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var registry: InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4?
      get() = registryState.valueOrNull()
      set(`value`) {
        registryState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c {
      check(ecosystemValue != null) { "ecosystem is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(namespaceValue != null) { "namespace is required" }
      check(ownerValue != null) { "owner is required" }
      check(packageTypeValue != null) { "packageType is required" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(packageVersionState !== FieldState.Absent) { "packageVersion is required, even when null" }
      check(registryState !== FieldState.Absent) { "registry is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c(
        createdAt = createdAtState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        ecosystem = ecosystem,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        namespace = namespace,
        owner = owner,
        packageType = packageType,
        packageVersion = packageVersionState.valueOrNull(),
        registry = registryState.valueOrNull(),
        updatedAt = updatedAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c must be a JSON object")
      val ecosystem = json.decodeRequired<String>(rawObject, "ecosystem")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val namespace = json.decodeRequired<String>(rawObject, "namespace")
      val owner = json.decodeRequired<InlineWebhookRegistryPackagePublishedRegistryPackageOwnerXf3db4a7a>(rawObject, "owner")
      val packageType = json.decodeRequired<String>(rawObject, "package_type")
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("package_version")) {
        throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c is missing required property 'package_version'")
      }
      val packageVersion = rawObject["package_version"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackagePublishedRegistryPackagePackageVersionXf3820ae7?>(requireNotNull(element)) }
      if (!rawObject.containsKey("registry")) {
        throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c is missing required property 'registry'")
      }
      val registry = rawObject["registry"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRegistryPackagePublishedRegistryPackageRegistryXd7b614d4?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ecosystem", value.ecosystem)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("namespace", value.namespace)
        put("owner", json.encodeToJsonElement(value.owner))
        put("package_type", value.packageType)
        put("package_version", value.packageVersion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("registry", value.registry?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c(block: InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c.Builder.() -> Unit): InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c = InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c property '" + name + "' is not nullable")
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
