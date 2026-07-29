package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/apple_pay_domain
 */
@Serializable(with = ApplePayDomain.Serializer::class)
public class ApplePayDomain(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  public val domainName: String,
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
  public val objectValue: InlineApplePayDomainObjectValueX8e34b46a,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var domainNameValue: String? = null

    public var domainName: String
      get() = requireNotNull(domainNameValue) { "domainName is required" }
      set(`value`) {
        domainNameValue = value
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

    private var objectValueValue: InlineApplePayDomainObjectValueX8e34b46a? = null

    public var objectValue: InlineApplePayDomainObjectValueX8e34b46a
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): ApplePayDomain {
      check(createdValue != null) { "created is required" }
      check(domainNameValue != null) { "domainName is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return ApplePayDomain(
        created = created,
        domainName = domainName,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApplePayDomain = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ApplePayDomain> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApplePayDomain {
      val jsonDecoder = decoder.requireJsonDecoder("ApplePayDomain")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ApplePayDomain must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val domainName = json.decodeRequired<String>(rawObject, "domain_name")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineApplePayDomainObjectValueX8e34b46a>(rawObject, "object")
      return ApplePayDomain(
        created = created,
        domainName = domainName,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApplePayDomain) {
      val jsonEncoder = encoder.requireJsonEncoder("ApplePayDomain")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("domain_name", value.domainName)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun applePayDomain(block: ApplePayDomain.Builder.() -> Unit): ApplePayDomain = ApplePayDomain.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ApplePayDomain is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
