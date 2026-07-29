package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Invoice Rendering Templates are used to configure how invoices are rendered on surfaces like the PDF. Invoice
 * Rendering Templates
 * can be created from within the Dashboard, and they can be used over the API when creating invoices.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_rendering_template
 */
@Serializable(with = InvoiceRenderingTemplate.Serializer::class)
public class InvoiceRenderingTemplate(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineInvoiceRenderingTemplateObjectValueXd53d954d,
  /**
   * The status of the template, one of `active` or `archived`.
   */
  public val status: InlineInvoiceRenderingTemplateStatusX802c7d42,
  /**
   * Version of this template; version increases by one when an update on the template changes any field that controls
   * invoice rendering
   */
  public val version: Int,
  metadata: Map<String, String>? = null,
  /**
   * A brief description of the template, hidden from customers
   */
  public val nickname: String? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineInvoiceRenderingTemplateObjectValueXd53d954d? = null

    public var objectValue: InlineInvoiceRenderingTemplateObjectValueXd53d954d
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineInvoiceRenderingTemplateStatusX802c7d42? = null

    public var status: InlineInvoiceRenderingTemplateStatusX802c7d42
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var versionValue: Int? = null

    public var version: Int
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * A brief description of the template, hidden from customers
     */
    public var nickname: String? = null

    public fun build(): InvoiceRenderingTemplate {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(versionValue != null) { "version is required" }
      return InvoiceRenderingTemplate(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        version = version,
        metadata = metadata,
        nickname = nickname,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceRenderingTemplate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoiceRenderingTemplate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceRenderingTemplate {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceRenderingTemplate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceRenderingTemplate must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineInvoiceRenderingTemplateObjectValueXd53d954d>(rawObject, "object")
      val status = json.decodeRequired<InlineInvoiceRenderingTemplateStatusX802c7d42>(rawObject, "status")
      val version = json.decodeRequired<Int>(rawObject, "version")
      return InvoiceRenderingTemplate(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        version = version,
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        nickname = rawObject["nickname"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceRenderingTemplate) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceRenderingTemplate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("version", json.encodeToJsonElement(value.version))
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nickname?.let { put("nickname", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceRenderingTemplate(block: InvoiceRenderingTemplate.Builder.() -> Unit): InvoiceRenderingTemplate = InvoiceRenderingTemplate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoiceRenderingTemplate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
